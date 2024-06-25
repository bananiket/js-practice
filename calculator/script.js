
// const show = document.getElementById("return")
// const buttons = document.querySelectorAll("button")
// for(let i = 0; i < buttons.length; i++){
//     buttons[i].addEventListener("click", handleClick)
// }
// function handleClick(event){
//     const buttonValue =  event.target.textContent;
//     alert(buttonValue);
// }

function doStuff() {
    const buttons = document.querySelectorAll("button")
    const show = document.getElementById("return")
    let currentInput = ""
    let previousInput = ""
    let operator = "" 
    let shouldResetScreen = false
    for (let i = 0; i < buttons.length; i++) {
        buttons[i].addEventListener("click", handleClick)
        // show.innerHTML = e.target.innerHTML;
      }
  
    function handleClick(event) {
      const buttonValue = event.target.textContent;
    //   alert(buttonValue);
        // if(buttonValue == "AC"){
        //     show.innerHTML = "";
        // } else if(!isNaN(buttonValue)){
        //     show.innerHTML += buttonValue
        //     // show.innerHTML = show.innerHTML + buttonValue
        // }
        if((buttonValue >= "0" && buttonValue <= "9") || buttonValue === "."){   // (t&t) || 1 === "." // (t) || f // t
          handleNumber(buttonValue)
        } else if(buttonValue === "AC"){
          clearCalc() 
        } else if(buttonValue === "Delete"){
          clearPreviousInput()
        } else if(buttonValue === "="){

        } else {
          handleOperator(buttonValue)
        }
          
    }
    
    function handleNumber(number){
      currentInput = currentInput + number
      updateDisplay()
      

    }
    function clearCalc(){
      currentInput = ""
      previousInput = ""
      operator = ""
      show.innerHTML = currentInput
    }

    function clearPreviousInput(){
      if(currentInput.length > 1){
        currentInput = currentInput.slice(0,-1)
      } else {
        currentInput = ""
      }
      updateDisplay()
    }

    function handleOperator(op){
      if(operator !== ""){
        calculate()
      } else {
        previousInput = currentInput
        currentInput = ""
        operator = op
      }
      updateDisplay()
    }

    function calculate(){

    }

    function updateDisplay(){
      if(operator !== "" && previousInput !== ""){
        show.innerHTML = previousInput + operator + currentInput
      } else {
        show.innerHTML = currentInput
      }
    }
}


  window.addEventListener("load", doStuff);

