<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application</title>
</head>
<body>
<form action="Application" method="POST" >
<h2> Application form for UNISA</h2>
<P>
<b>Student detail:</b>
</p>
<div>
  <label> First name </label>
  <input type="text" name="firstName"/>
</div>
<p>
<div>
  <label> Last name </label>
  <input type="text" name="lastName"/>
</div>
<p>
</p>
<div>
  <label>Telephone number</label>
  <input type="number" name="TelephoneNumber"/>
</div>
<p>
</p>
<div>
  <label> Email </label>
  <input type="email" name="emailAddress"/>
</div>
<p>
</p>
<div>
  <label>Date Of Birth </label>
  <input type="date" name="dateOfBirth"/>
</div>
<p>
</p>
<div>
  <label>Marital status:</label>
<p>
  Single<input type = "radio" name = "maritalStatus"/>
  Married<input type = "radio" name = "maritalStatus"/>
</p>
</div>
<p>
</p>
<b>Select courses:</b>
<p>
</p>
<label> Java </label>
<input type="text" name ="Java"/>
<label>PHP </label>
<input type="text" name="PHP"/>

<label>C# </label>
<input type="text" name="C#"/>
<label> Python </label>
<input type="text" name="Python"/>
<label>C++</label>
<input type="text" name="C++"/>
<p></p>
<input type="submit" value="SEND"/>

</form>

</body>
</html>