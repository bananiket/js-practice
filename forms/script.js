
// function execute(){
//     const show = document.getElementById("show-out")
//     const firstName = document.getElementById("firstName")
//     const lastName = document.getElementById("lastName")
//     const age = document.getElementById("age")
//     const gender = document.getElementById("gender")
//     const contactNumber = document.getElementById("contactNumber")
//     const email = document.getElementById("email")
//     const otherText = document.getElementById("other-condt")
//     const conditions = document.querySelectorAll('input[name="condition"]');
//     console.log(conditions)
//     let conditionsValue = []
//     for(let i = 0; i < conditions.length; i++){
//         conditionsValue.push(conditions[i].value)
//         if(conditions[i].value === "Other"){
//             otherText.style.display = "block"
//         }
//     }
//     const submit = document.getElementById("submit")
//     submit.addEventListener("click", onClick)

//     function onClick(event){
//         event.preventDefault()
//         show.innerHTML = `
//             ${firstName.value} ${lastName.value}<br>
//             ${age.value} ${gender.value}<br>
//             ${contactNumber.value} ${email.value}<br>
//             ${conditionsValue.join(", ")}
//         `
//     }
      
// }



// window.addEventListener("load", execute)

document.addEventListener('DOMContentLoaded', function() {
    const conditions = document.querySelectorAll('input[name="condition"]');
    const otherText = document.getElementById('other-condt');

    conditions.forEach(condition => {
        condition.addEventListener('change', function() {
            if (condition.value === 'Other' && condition.checked) {
                otherText.style.display = 'block';
            } else if (condition.value === 'Other' && !condition.checked) {
                otherText.style.display = 'none';
            }
        });
    });
});

function execute() {
    event.preventDefault();

    const show = document.getElementById('show-out');
    const firstName = document.getElementById('firstName');
    const lastName = document.getElementById('lastName');
    const age = document.getElementById('age');
    const gender = document.getElementById('gender');
    const contactNumber = document.getElementById('contactNumber');
    const email = document.getElementById('email');
    const conditions = document.querySelectorAll('input[name="condition"]:checked');

    let conditionsValue = [];
    conditions.forEach(condition => {
        conditionsValue.push(condition.value);
    });

    show.innerHTML = `
        <p><strong>Name:</strong> ${firstName.value} ${lastName.value}</p>
        <p><strong>Age & Gender:</strong> ${age.value}, ${gender.value}</p>
        <p><strong>Contact:</strong> ${contactNumber.value}, ${email.value}</p>
        <p><strong>Conditions:</strong> ${conditionsValue.join(', ')}</p>
    `
    show.style.display = 'block';
}