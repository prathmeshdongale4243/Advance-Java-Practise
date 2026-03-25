<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-lg-6 col-md-8 col-sm-12">

            <div class="card shadow">
               <div class="card-header text-white text-center py-4"
      style="background: linear-gradient(135deg, #0d6efd, #6610f2);">
    <h3 class="fw-semibold">
        Welcome , <span class="fw-bold">${user.name}</span> 🎉
    </h3>
				</div>


                <div class="card-body table-responsive">
                    <table class="table table-bordered table-striped">
                        <tbody>
                            <tr>
                                <th>User Id</th>
                                <td>${user.id}</td>
                            </tr>

                            <tr>
                                <th>User Name</th>
                                <td>${user.name}</td>
                            </tr>

                            <tr>
                                <th>User Email</th>
                                <td>${user.email}</td>
                            </tr>

                            <tr>
                                <th>User Password</th>
                                <td>${user.password}</td>
                            </tr>

                            <tr>
                                <th>User Gender</th>
                                <td>${user.gender}</td>
                            </tr>

                            <tr>
                                <th>User City</th>
                                <td>${user.city}</td>
                            </tr>
                        </tbody>
                    </table>
                </div>

                <div class="card-footer text-center">
                    <a href="Home" class="btn btn-success">Go Home</a>
                </div>
            </div>

        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
