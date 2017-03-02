<%-- 
    Document   : test
    Created on : Feb 27, 2017, 9:36:05 PM
    Author     : Bashar Othman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <link rel="stylesheet"  type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css">
        <link rel="stylesheet" type="text/css" href="css/datepicker.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">

        <link rel="stylesheet" type="text/css" href="css/rating.css">


        <script src="js/jquery-3.1.1.js" ></script>
        <script src="js/bootstrap.js" ></script>
        <script src="js/datepicker.js" ></script>
        <script src="js/bootstrap-rating-input.min.js" ></script>
        <script src="js/rating.js" ></script>
        <script type="text/javascript">
            $(function () {
                $('.container').rating();
            });
        </script>

        <script>
            $('.container').rating(function (vote, event) {
                console.log(vote, event);
            });

            /*
             $(function () {
             $('input').on('change', function () {
             alert("Changed: " + $(this).val())
             });
             });
             */
        </script>

        <style>
            body {
                font-size: 20px;
                padding: 50px;
            }

            .myclass {
                color: red;
                font-size: 12px;
            }

        </style>
    </head>
    <body>

        <div class="container">
            <div class="row">
                <h2>Expedia Query Example</h2>
            </div>
        </div>

        <form class="form-horizontal"  action="SearchOffers" method="POST" >

            <fieldset>
                <!-- Form Name -->
                <legend>search for Hotels ..</legend>

                <!-- Appended Input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="myCity">Destination :</label>
                    <div class="col-md-8">
                        <div class="input-group">
                            <input id="destination" name="destination" class="form-control" placeholder="example: New Yourk" type="text"  >
                            <span class="input-group-addon"></span>
                        </div>
                        <p class="help-block"></p>
                    </div>
                </div>
                </BR>
                <div class="form-group">
                    <label class="col-md-4 control-label" for="regionid">Region ID :</label>
                    <div class="col-md-8">
                        <div class="input-group">
                            <input id="regionid" name="regionid" class="form-control" placeholder="example:33321 "  type="text"  >
                            <span class="input-group-addon"></span>
                        </div>
                        <p class="help-block"></p>
                    </div>
                </div>
                </BR>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="regionid">Min Trip Start Date :</label>
                    <div class="col-md-8">
                        <div class="input-group date" data-provide="datepicker">
                            <input type="text" class="form-control" name="minStartTripDate">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-th"></span>
                            </div>
                        </div>
                        <p class="help-block"></p>
                    </div>
                </div>
                </BR>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="regionid">Max Trip Start Date :</label>
                    <div class="col-md-8">
                        <div class="input-group date" data-provide="datepicker">
                            <input type="text" class="form-control" name="maxStartTripDate">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-th"></span>
                            </div>
                        </div>
                        <p class="help-block"></p>
                    </div>
                </div>
                </BR>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="hotelrate">Min Hotel Rate:</label>
                    <div class="col-md-8">
                        <div class="input-group">
                            <section class="container" onclick="" id="hotelrate" name="hotelrate">
                                <input type="radio" name="minrate" class="rating" value="1" />
                                <input type="radio" name="minrate" class="rating" value="2" />
                                <input type="radio" name="minrate" class="rating" value="3" />
                                <input type="radio" name="minrate" class="rating" value="4" />
                                <input type="radio" name="minrate" class="rating" value="5" />
                            </section>
                        </div>
                        <p class="help-block"></p>
                    </div>
                    </BR>

                    <label class="col-md-4 control-label" for="hotelrate">Max Hotel Rate:</label>
                    <div class="col-md-8">
                        <div class="input-group">
                            <section class="container" onclick="" id="hotelrate" name="hotelrate">
                                <input type="radio" name="maxrate" class="rating" value="1" />
                                <input type="radio" name="maxrate" class="rating" value="2" />
                                <input type="radio" name="maxrate" class="rating" value="3" />
                                <input type="radio" name="maxrate" class="rating" value="4" />
                                <input type="radio" name="maxrate" class="rating" value="5" />
                            </section>
                        </div>
                        <p class="help-block"></p>
                    </div>
                </div>
                </BR>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="lengthofstay">Length of Stay :</label>
                    <select class="form-control" id="sel1" name="lengthOfStay">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                    </select>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="hotelrate">Car package</label>
                    <div class="col-md-8">
                        <div class="input-group">
                            Yes  <input type="radio" name="car"   value="1"   />
                            No   <input type="radio" name="car"   value="0"   checked/>
                        </div>
                        <p class="help-block"></p>
                    </div>
                </div>

                </BR>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="search"></label>
                    <div class="col-md-4">
                        <input  type="submit" id="search" name="search" value="Search" class="btn btn-primary" ></button>
                    </div>
                </div>
            </fieldset>

        </form>

    </body>
</html>
