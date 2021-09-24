let number1 = 1;
let number2 = 2;
let userInput = 0;
let result = 0;
let expression = '';
let level = 0;
let randomRang = 0;
let score = 0;
let counter = 0;

document.getElementById('levelSetup').innerHTML=`
<div class="d-flex justify-content-between p-5">
    <div class="border border-dark p-2">
        <p class="text-center bg-dark text-white p-3 mb-2 font-weight-bold">Difficulty</p>
        <button class="btn btn-primary" value='+' onclick="setExpression(this)">+</button>
        <button class="btn btn-primary" value='-' onclick="setExpression(this)">-</button>
        <button class="btn btn-primary" value='x' onclick="setExpression(this)">x</button>
        <button class="btn btn-primary" value='/' onclick="setExpression(this)">/</button>
    </div>
        
    <div class="border border-dark p-2">
        <p class="text-center bg-dark text-white p-3 mb-2 font-weight-bold">Level</p>
        <button class="btn btn-primary" value="1" onclick="setLevel(this)">1</button>
        <button class="btn btn-primary" value="2" onclick="setLevel(this)">2</button>
        <button class="btn btn-primary" value="3" onclick="setLevel(this)">3</button>
        <button class="btn btn-primary" value="4" onclick="setLevel(this)">4</button>
        <button class="btn btn-primary" value="5" onclick="setLevel(this)">5</button>
    </div>
</div>
`;

function setExpression(ex) {
    expression = ex.value;
    startTestQuestion();
}

function setLevel(lev) {
    level = lev.value;
    switch(level) {
        case '1': 
        randomRang = 10;
        break;
        case '2': 
        randomRang = 100;
        break;
        case '3': 
        randomRang = 1000;
        break;
        case '4': 
        randomRang = 10000;
        break;
        case '5': 
        randomRang = 100000;
        break;
    }

    startTestQuestion();
}

function startTestQuestion() {
    if(expression!= '' && level > 0) {
        calculateTest();
    }
    showScoreInformation();
}
function calculateTest() {

    document.getElementById('result').innerHTML='';

    number1 = Math.floor(Math.random()*randomRang);
    number2 = Math.floor(Math.random()*randomRang);
    // console.log(number1 + ',' + number2);

    switch(expression) {

        case '+':
        result = number1 + number2;
        break;
        case '-':
        result = number1 - number2;
        break;
        case 'x':
        result = number1 * number2;
        break;
        case '/':
            if(number2 === 0) {
                result = (number1 / number2 + 1).toFixed(2);
            } else {
                result = (number1 / number2).toFixed(2);
            }
        break;
    }
    testQuestion();
}

function testQuestion() {
    document.getElementById('levelSetup').innerHTML='';

    document.getElementById('calculate').innerHTML=`
        <div class="input-group input-group-lg p-5">
            <div class="input-group-prepend">
            <span class="input-group-text" style="font-size: 40px"
                > ${number1} ${expression} ${number2} =</span
            >
            </div>
            <input type="number" id="playerInput" class="form-control" style="font-size: 40px" />
            <div class="input-group-append">
                <button class="btn btn-success" style="font-size: 40px" onclick="setUserInput()">
                    validate
                </button>
            </div>
        </div>
    `;
}

function setUserInput() {
    let inputUserResult = parseFloat(document.getElementById('playerInput').value);

    if(!isNaN(inputUserResult)) {
        userInput = inputUserResult;
        checkUserResult();
    } else {
        alert('Oops no number found in the input!')
    }
}

function checkUserResult() {
    if(userInput == result) {
        document.getElementById('result').innerHTML=`
        <div class="p-5">
            <div class="p-3 text-center bg-success text-white" style="font-size: 40px">
                ${number1} ${expression} ${number2} = ${userInput} good Job !
            </div>
        </div>

        `;
        score++;
    } else {
        document.getElementById('result').innerHTML=`
        <div class="p-5">
            <div class="p-3 text-center bg-danger text-white" style="font-size: 40px">
                ${number1} ${expression} ${number2} = ${userInput} is not correct it should be ${result}
            </div>
        </div>
        `;
    }
    counter++;

    showScoreInformation();
    if(counter < 20) {
        setTimeout(calculateTest,3000);
    } else {
        document.getElementById('score').innerHTML="";
        document.getElementById('calculate').innerHTML="";
        document.getElementById('result').innerHTML=`
        <div class="p-5">
            <div class="p-3 text-center bg-warning text-white" style="font-size: 40px">
                Test done your Score is ${score}/20
            </div>
        </div>
        `;
    }
}

function showScoreInformation() {
    document.getElementById('score').innerHTML=`
    <p class="m-0">Score : ${score}/20</p>
    <p class="m-0">Expression : ${expression} </p>
    <p class="m-0">Level : ${level} </p>
`;
}