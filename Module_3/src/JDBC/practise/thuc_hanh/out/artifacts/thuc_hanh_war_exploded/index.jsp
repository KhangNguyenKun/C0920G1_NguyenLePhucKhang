<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/17/2020
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css_case_study_header.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
        integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA=="
        crossorigin="anonymous"/>
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
          integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
          crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
          integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
          crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
          integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
          crossorigin="anonymous"></script>
  <title>Layout</title>
</head>
<body>
<div class="container" style="height: auto">
  <header class="row">
    <div class="col-sm-8 shopping-mall">
      <h1>BOOKSELF</h1>
      <h4>Every books that you want is almost in here</h4>
    </div>
    <img class="col-sm-4"
         src="https://gamek.mediacdn.vn/133514250583805952/2020/4/28/anh-0-15880849279571109053190.jpg"/>
  </header>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  </nav>
  <div class="row">
    <article class="col-sm-9">
    </article>
    <aside class="col-sm-3">
    </aside>
  </div>
  <!--    <footer class="card">-->
  <!--        <div class = "card-header text-center">-->
  <!--            <p>CodeGym &copy; 2017</p>-->
  <!--        </div>-->
  <!--    </footer>-->
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#" style="font-family: 'Agency FB'">Bookself</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="#"><i class="fas fa-home"></i>Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#"><i class="fas fa-link"></i>Link</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
             data-toggle="dropdown"
             aria-haspopup="true" aria-expanded="false"><i class="fas fa-list"></i>
            List
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">Forum</a>
            <a class="dropdown-item" href="#"><span class="fas fa-book-open"></span>Product</a>

            <a class="dropdown-item" href="#"><span class="fas fa-address-book"></span> Contact</a>
          </div>
        </li>
      </ul>
      <form class="form-inline my-2 my-lg-0">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
      </form>
    </div>
  </nav>
</div>
<div id="content">
  <div id="chap1" style="margin-left: 100px">
    <img src="https://i133.photobucket.com/albums/q80/trungcang/h1/1-169.jpg"/>
    <p> Cụ Albus Dumbledore (giáo sư Trường Phù thủy và Pháp sư Hogwarts) đến đường Privet Driver
      và gặp giáo sư Minerva McGonagall
      (hóa thân thành một con mèo) và kể cho bà về cái chết của vợ chồng James và Lily Potter. Cùng lúc đó, Rubeus
      Hagrid đưa Harry Potter
      , một đứa bé mồ côi khi đó mới 1 tuổi đến bằng mô tô bay. Cụ đặt cậu bé lên thềm nhà số 4 cùng 1 bức thư gửi
      cho những người thân còn
      lại duy nhất của cậu, nhà Dursley. Cụ nói: "Harry Potter, chúc may mắn!"</p>
  </div>
  <div class="container" id="right">
    <table class="table table-hover">
      <thead>
      <tr>
        <th>List Chapter</th>
      </tr>
      </thead>
      <tbody>
      <tr>
        <td>Chapter 1</td>
      </tr>
      <tr>
        <td>Chapter 2</td>
      </tr>
      <tr>
        <td>Chapter 3</td>
      </tr>
      <tr>
        <td>Chapter 4</td>
      </tr>
      <tr>
        <td>Chapter 5</td>
      </tr>
      </tbody>
    </table>
  </div>

</div>
</body>
</html>
