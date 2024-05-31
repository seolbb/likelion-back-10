package sample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import sample.bean.Dice;
import sample.bean.Game;
import sample.bean.Player;

import java.util.List;

@ComponentScan(basePackages = "sample")
@PropertySource({"classpath:game.properties"})
public class GameConfig {

    @Bean
    public Dice dice(@Value("${face}") int face){
        return new Dice(face);
    }
    @Bean
    public Player kang(Dice dice){
        Player player = new Player();
        player.setDice(dice);   //dice 를 주입하고 있는 코드..(설정자방식으로 주입!!)
        player.setName("강경미");
        return player;
    }
    @Bean
    public Player kim(Dice dice){
        Player player = new Player();
        player.setDice(dice);   //dice 를 주입하고 있는 코드..(설정자방식으로 주입!!)
        player.setName("김둘리");
        return player;
    }
    @Bean
    public Player hong(Dice dice){
        Player player = new Player();
        player.setDice(dice);   //dice 를 주입하고 있는 코드..(설정자방식으로 주입!!)
        player.setName("홍길동");
        return player;
    }
    @Bean
    public Player lee(Dice dice){
        Player player = new Player();
        player.setDice(dice);   //dice 를 주입하고 있는 코드..(설정자방식으로 주입!!)
        player.setName("이또치");
        return player;
    }

    @Bean
    public Game game(List<Player> players){
//        return new Game(players);   // 생성자 주입
        Game game = new Game();
        game.setPlayerList(players);  //설정자 주입
        return game;
    }

    /*
    <bean id="dice" class="sample.Dice">
		<constructor-arg value="6"/>
	</bean>
	<bean id="kang" class="sample.Player">
		<property name="dice" ref="dice" />
		<property name="name" value="강경미" />
	</bean>
	<bean id="kim" class="sample.Player">
		<property name="dice" ref="dice" />
		<property name="name" value="김둘리" />
	</bean>
	<bean id="hong" class="sample.Player">
		<property name="dice" ref="dice" />
		<property name="name" value="홍길동" />
	</bean>
	<bean id="lee" class="sample.Player">
		<property name="dice" ref="dice" />
		<property name="name" value="이효리" />
	</bean>

	<bean id="game" class="sample.Game">
		<property name="playerList">
			<list>
				<ref bean="kang"/>
				<ref bean="kim"/>
				<ref bean="hong"/>
				<ref bean="lee"/>
			</list>
		</property>
	</bean>
     */
}
