<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>SIMPLE CALCULATOR</title>
  </head>
  <body>
    <h1>SIMPLE CALCULATOR</h1>

    <form method="post" action="/calculate">
      <p>
        <label for="firstOperand">First Operand</label>
        <input type="number" name="firstOperand" id="firstOperand">
      </p>
      <p>
        <label for="operator">Operator</label>
        <select name="operator" id="operator">
          <option value="+">+</option>
          <option value="-">-</option>
          <option value="*">*</option>
          <option value="/">/</option>
        </select>
      </p>
      <p>
        <label for="secondOperand">Second Operand</label>
        <input type="number" name="secondOperand" id="secondOperand">
      </p>
      <p>
        <label> </label>
        <button type="submit">Calculate</button>
      </p>
    </form>
  </body>
</html>
