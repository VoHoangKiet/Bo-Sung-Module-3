<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body><h1>Simple Calculator</h1>
<form action="${pageContext.request.contextPath}/calculator-servlet" method="get">
  Product Description: <label>
  <input type="text" name="description">
</label>
  List Price: <label>
  <input type="text" name="a">
</label>
  Discount Percent: <label>
  <input type="text" name="b">
</label>
  <input type="submit" value="Calculate">
</form>
Kết quả: ${result}
</body>
</html>