//초기데이터
let basicDatas = [
  { id: 1, title: "Todo 1", done: false },
  { id: 2, title: "Todo 2", done: true },
];

const deleteTodo = (id) => {
  console.log(id);
  basicDatas = basicDatas.filter((todo) => todo.id != id);
  console.log(basicDatas);
};

const addTodoItem = (todoObj) => {
  const li = document.createElement("li");
  li.className = "todo-item";
  const textSpan = document.createElement("SPAN");
  textSpan.className = "todo-text";
  const todotxt = document.createTextNode(todoObj.title);

  textSpan.appendChild(todotxt);

  //완료된 일인지 done:true 인지 체크해서 class = checked 를 추가함.
  if (todoObj.done) {
    textSpan.classList.toggle("checked");
  }

  li.appendChild(textSpan);

  li.setAttribute("id", todoObj.id);
  document.getElementById("todo-item-list").appendChild(li);

  //삭제버튼과 이벤트 추가.
  const removeSpan = document.createElement("SPAN");
  const removetxt = document.createTextNode("\u00D7");
  removeSpan.className = "remove";
  removeSpan.appendChild(removetxt);
  li.appendChild(removeSpan);

  removeSpan.addEventListener("click", (event) => {
    const liObj = event.target.parentElement;
    deleteTodo(liObj.getAttribute("id"));
    liObj.remove();
    event.stopPropagation();
  });
};

//초기데이터를 화면에 보여주는 함수
const getTodos = () => {
  basicDatas.forEach(addTodoItem);
};

getTodos();

//입력받은 Todo를 basicDatas 배열에 추가하고, 화면에도 추가되도록 하는 함수
const postTodo = (todoTitle) => {
  //id를 구해오는 일.
  let newId = basicDatas.length
    ? Math.max(...basicDatas.map((todo) => todo.id)) + 1
    : 1;

  const newTodo = { id: newId, title: todoTitle, done: false };
  basicDatas.push(newTodo);
  addTodoItem(newTodo);
};

//추가 버튼이 클릭되었을 때 Todo1건이 추가되도록 이벤트를 작성
const inputBtn = document.querySelector(".add-button");
inputBtn.addEventListener("click", () => {
  let inputValue = document.querySelector("#myInput").value;
  if (inputValue === "") {
    alert("할 일을 입력해 주세요^^");
    return;
  }
  // 입력상자 비워줌
  document.querySelector("#myInput").value = "";
  postTodo(inputValue);
});

//엔터키를 입력했을 때 Todo가 추가되도록 구현.
const inputField = document.querySelector("#myInput");

inputField.addEventListener("keydown", (event) => {
  //   alert(event.key);
  //   alert(event.keyCode);
  if (event.key === "Enter") {
    let inputValue = inputField.value;
    if (inputValue === "") {
      alert("할 일을 입력해 주세요^^");
      return;
    }
    // 입력상자 비워줌
    inputField.value = "";
    postTodo(inputValue);
  }
});

const updateTodo = (id) => {
  const todo = basicDatas.find((todo) => todo.id == id);
  console.log(todo);
  if (todo) {
    todo.done = !todo.done;
  }
};

//할일 상태 업데이트를 위해서 할일title이 눌렸을때 이벤트가 발생되도록 코드 구현.
//li 에 이벤트를 등록할지??  ul 에 등록할지.. 생각해보세요..
const todoUl = document.getElementById("todo-item-list");
todoUl.addEventListener("click", (event) => {
  //코드가 실행되면서 eventTarget이 바뀌어야해서...  let 으로 수정합니다.
  let eventTarget = event.target;

  //   alert(eventTarget.value);
  //   console.log(eventTarget);
  //   console.log(eventTarget.value);
  if (event.target.tagName === "LI" || event.target.tagName === "SPAN") {
    if (event.target.tagName === "LI") {
      eventTarget = eventTarget.querySelector(".todo-text");
    }
    const liObj = eventTarget.parentElement;

    updateTodo(liObj.getAttribute("id"));
    eventTarget.classList.toggle("checked");
  }
});
//입력 - post  C   수정 - patch (put) U  삭제 - delete D  읽기 - get   R
