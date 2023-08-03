let input = '';

function appendNumber(num) {
  input += num;
  updateResult();
}

function appendOperator(op) {
  input += ' ' + op + ' ';
  updateResult();
}

function clearInput() {
  input = '';
  updateResult();
}

function calculateResult() {
  try {
    const result = eval(input);
    input = result.toString();
    updateResult();
  } catch (error) {
    input = 'Error';
    updateResult();
  }
}

function updateResult() {
  document.getElementById('result').value = input;
}
