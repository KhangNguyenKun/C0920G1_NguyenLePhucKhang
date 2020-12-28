<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/18/2020
  Time: 4:21 PM
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
<style>
    #content{
        margin-left: 120px;
        width: 80%;
        position: relative;
        top: 30px;
    }
</style>
</head>
<body>
<div class="container" >
    <header class="row">
        <div class="col-sm-8 shopping-mall">
            <h1>FURAMA RESORT</h1>

        </div>
        <img class="col-sm-4"
             src="https://bazantravel.com/cdn/medias/uploads/53/53114-furama-resort-da-nang-11.jpg"/>
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

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="btn btn-outline-dark" href="/"><i class="fas fa-home"></i>Home <span class="sr-only">(current)</span></a>
                </li>
                <div class="dropdown">
                    <button class="btn btn-outline-dark" type="button" id="dropdownMenuButton"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Choice
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item" href="/customers"><span ></span> Customers List</a>
                        <a class="dropdown-item" href="/customers?action=create"><span ></span>Create
                            customer</a>

                        <a class="dropdown-item" href="/employees"><span ></span> Employee List</a>
                        <a class="dropdown-item" href="/contract"><span ></span>
                            Contract</a>
                    </div>
                </div>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
</div>

<div id="content">
    <div id="demo" class="carousel slide" data-ride="carousel">

        <!-- Indicators -->
        <ul class="carousel-indicators">
            <li data-target="#demo" data-slide-to="0" class="active"></li>
            <li data-target="#demo" data-slide-to="1"></li>
            <li data-target="#demo" data-slide-to="2"></li>
            <li data-target="#demo" data-slide-to="3"></li>
            <li data-target="#demo" data-slide-to="4"></li>
        </ul>

        <!-- The slideshow -->
        <div class="carousel-inner data-interval='1000'">
            <div class="carousel-item active">
                <img src="https://cdn1.ivivu.com/iVivu/2019/11/28/13/furama-resort-da-nang-6-cr-800x450.jpg" alt="" width="100%" height="600px">
            </div>
            <div class="carousel-item">
                <img src="https://cf.bstatic.com/images/hotel/max1024x768/623/62371531.jpg" height="600px" width="100%" alt="">
            </div>
            <div class="carousel-item">
                <img src="https://furamavietnam.com/wp-content/uploads/2018/07/Vietnam_Danang_Furama_Resort_Exterior_Beach.jpg" alt="" width="100%" height="600px">
            </div>
            <div class="carousel-item">
                <img src="https://hd1.hotdeal.vn/hinhanh/HN/75371_0_body_1.jpg" alt="" width="100%" height="600px">
            </div>

        </div>

        <!-- Left and right controls -->
        <a class="carousel-control-prev" href="#demo" data-slide="prev">
            <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#demo" data-slide="next">
            <span class="carousel-control-next-icon"></span>
        </a>
    </div>
</div>
</div>
<script>
    $(function(){
        var myImage = document.querySelector('img');
        myImage.onclick = function() {
            var mySrc = myImage.getAttribute('src');
            if(mySrc === 'http://static.tumblr.com/1bd1b615e6da70dd71dc84fd2f47c80d/zpmncfu/oxNng9hfv/tumblr_static_95p88l86si88ks4w4wws04wk8.png') {
                myImage.setAttribute ('src','https://cdn-insomniac.s3.amazonaws.com/emoji_sexface.png');
            } else {
                myImage.setAttribute ('src','http://static.tumblr.com/1bd1b615e6da70dd71dc84fd2f47c80d/zpmncfu/oxNng9hfv/tumblr_static_95p88l86si88ks4w4wws04wk8.png');
            }
        };
    });
</script>
</body>
</html>
