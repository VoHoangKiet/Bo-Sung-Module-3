<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="${pageContext.request.contextPath}/calculator-servlet" method="get">
  first operand: <label>
  <input type="text" name="a">
</label>
  Operator:
  <label>
    <select name="ope">
      <option value="+">+</option>
      <option value="-">-</option>
      <option value="*">x</option>
      <option value="/">/</option>
    </select>
  </label>
  second operand: <label>
  <input type="text" name="b">
</label>
  <input type="submit" value="Calculate">
</form>
Kết quả: ${result}
</body>
</html>