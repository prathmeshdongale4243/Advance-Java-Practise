<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container">

    <div class="row justify-content-center">
        <div class="col-md-6 mt-5">

            <div class="card shadow">
                <div class="card-header text-center">
                <h3>${msg}</h3>
                    <h4>Register Account</h4>
                </div>

                <div class="card-body">
                    <form action="save" method="post">

                        <div class="mb-3">
                            <label>Name</label>
                            <input type="text" class="form-control" name="username" placeholder="Enter Name" required>
                        </div>

                        <div class="mb-3">
                            <label>Email</label>
                            <input type="email" class="form-control" name="email" placeholder="Enter Email" required>
                        </div>

                        <div class="mb-3">
                            <label>Password</label>
                            <input type="password" class="form-control" name="password" placeholder="Enter Password" required>
                        </div>

                        <div class="mb-3">
                            <label>Gender</label><br>
                            <input type="radio" name="gender" value="Male" required> Male
                            <input type="radio" name="gender" value="Female"> Female
                        </div>

                        <div class="mb-3">
                            <label>City</label>
                            <select name="city" class="form-select" required>
                                <option value="">-- Select City --</option>
                                <option value="Kolhapur">Kolhapur</option>
                                <option value="Sangli">Sangli</option>
                                <option value="Satara">Satara</option>
                                <option value="Pune">Pune</option>
                                <option value="Mumbai">Mumbai</option>
                            </select>
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-success">Register</button>
                        </div>

                    </form>
                </div>

                <div class="card-footer text-center">
                    Already have an account?
                    <a href="login.jsp">Login</a>
                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>
