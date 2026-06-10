console.log("jeeva");
const first= 1;
const second=2;
console.log("first");
const str="santhosh";
console.log(str)
const fruits=["apple","orange","grapes"]
console.log(fruits[0])
fruits[1]="orange"
console.log(fruits[1])
const arr=[1,"name", false,2.4]
console.log(arr)
for(let i=0; i<arr.length;i++){
    console.log(arr[i])
}
const fourth = document .getElementById("ptag")
fourth.innerHTML="this my fourth "
function newfunction(){
    console.log(" I am ")
}
const input = document.getElementById("eventlistene")
const output = document.getElementById("Ptag")
input.addEventListener("input", ()=>{
    output.textContent = input.value

})
const newvar = document.createElement("P");
newvar.textContent = "new paragraph";
document.body.appendChild(newvar);
 
newvar.remove()