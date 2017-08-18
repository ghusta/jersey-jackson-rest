<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REST Services</title>
</head>
<body>
<div class="container">
    <h1>Index</h1>

    <div>
        REST resources :
        <ul>
            <li><a href="<%= request.getContextPath() %>/rest/app/">MyResource</a></li>
            <li><a href="<%= request.getContextPath() %>/rest/app/test">MyResource :: Test</a></li>
        </ul>
    </div>

</div>
</body>
</html>
