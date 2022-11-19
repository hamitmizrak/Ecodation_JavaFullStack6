//todo list variable
//DOM
//add item input
const addInput = document.getElementById("add_input");

//add item button
const addButton = document.getElementById("add_button");

//todo task (ul)
const todoTask = document.getElementById("todo_task");

//complete list (ul)
const completeList = document.getElementById("complete_list");

//#### CREATE #######
// list item
let createNewTask = function (valueData) {

    //checkbox
    let checkBox = document.createElement("input");
    checkBox.type = "checkbox";

    //label
    let label = document.createElement("label");
    label.innerText = valueData;

    //edit Input Text
    let editInput=document.createElement("input");
    editInput.type="text";

    //edit Button
    let editButton=document.createElement("button");
    editButton.innerText="Edit";
    editButton.className="edit";

    //delete Button
    let deleteButton=document.createElement("button");
    deleteButton.innerText="Delete";
    deleteButton.className="delete";

    //append
    let listItem=document.createElement("li");
    listItem.appendChild(checkBox);
    listItem.appendChild(label);
    listItem.appendChild(editInput);
    listItem.appendChild(editButton);
    listItem.appendChild(deleteButton);
    return listItem;
}

//#### ADD #######

//#### DELETE #######

//#### COMPLETE #######
