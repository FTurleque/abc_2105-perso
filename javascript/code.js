let number1 = 1;
let number2 = 2;
let userInput = 0;
let result = 0;
let expression = '';
let level = 0;
randomRang = 0;
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
