<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container">
 
    <div class="row justify-content-center">
        <div class="col-md-4 mt-5">

            <div class="card shadow">
                <div class="card-header text-center">
                    <h4 >${msg}</h4>
                    <h4>Login</h4>
                </div>

                <div class="card-body">
                
                    <form action="login" method="post">

                        <div class="mb-3">
                            <label>Email</label>
                            <input type="email" class="form-control" name="email" placeholder="Enter Email" required>
                        </div>

                        <div class="mb-3">
                            <label>Password</label>
                            <input type="password" class="form-control" name="password" placeholder="Enter Password" required>
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Login</button>
                        </div>
                    </form>
                </div>

                <div class="card-footer text-center">
                    New User?
                    <a href="Ram_Form2.jsp">Sign Up</a>
                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>
