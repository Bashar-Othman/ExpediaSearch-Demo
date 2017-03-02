<%-- 
    Document   : result
    Created on : Feb 28, 2017, 11:57:47 PM
    Author     : Bashar Othman
--%>

<%@page import="com.expedia.core.QueryExecutorManager"%>
<%@page import="java.util.List"%>
<%@page import="com.expedia.model.Hotel"%>
<%@page import="com.expedia.model.Hotel"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <head>

        <link rel="stylesheet"  type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css">
        <link rel="stylesheet" type="text/css" href="css/datepicker.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">

        <link rel="stylesheet" type="text/css" href="css/cus.css">

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


        <link href="https://cdn.datahc.com/Styles/Style.ashx?affiliateId=29622&branding=438773&key=MainWhitelabel&v=636202223216630000-2022324960&cdn=1.0.2017.059002" rel="stylesheet" type="text/css" inspectlet-ignore /><link href="https://cdn.datahc.com/Styles/Style.ashx?affiliateId=29622&branding=438773&key=PlaceWhitelabel&v=636202223216630000-2022324960&cdn=1.0.2017.059002" rel="stylesheet" type="text/css" inspectlet-ignore />


        <link href="https://media.datahc.com/Affiliates/29622/Brands/Styles/hotelhunter.css" rel="stylesheet" type="text/css" inspectlet-ignore />



    </head>
</head>
<body>
    <%
        List<Hotel> hotels = (List<Hotel>) request.getAttribute("hotelsList");

    %>
    <div id="hc_r_2b">

        <div id="hc_popularHotels" class="hc_m_v13 hc_i_layout_v4 " data-ceid="placelanding_popularhotels">
            <b class="b1h"></b><b class="b2h"></b><b class="b3h"></b><b class="b4h"></b><div class="hc_m_outer">

                <div class="hc_m_hd">	
                    <h2>Hotels List</h2>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="search"></label>
                        <div class="col-md-4">
                            <a  href="index.jsp">Clear Result &  Re-search</a>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="totals"></label>
                        <div class="col-md-4">
                            Total result:<%=hotels.size()%> 
                        </div>
                    </div>
                </div>	



                <div class="hc_m_content">
                    <table><tr>
                            <%                                for (Hotel h : hotels) {
                            %>

                        <div class="hc_sri hc_m" data-filename="expedia">
                            <div class="hc_i_wrapper">
                                <div class="hc_i">
                                    <h3>
                                        <%=h.getHotelInfo().getHotelName()%>
                                    </h3>
                                    <!--   <p class="hc-hotelrating hc-hotelrating--star" title="(5 stars)"><span class="hc-hotelrating__value hc-hotelrating__value--5"></span></p>-->
                                    <dl>
                                        <dt class="hc_i_addr"></dt>
                                        <dd class="hc_i_addr"><%=h.getHotelInfo().getHotelStreetAddress()%>, <%=h.getHotelInfo().getHotelCity()%> </dd>

                                        <dd class="hc_i_usrRating">users rating <%=h.getHotelInfo().getHotelGuestReviewRating()%></dd>
                                        <dt class="hc_i_booking">Latest Booking</dt>
                                        <dt class="hc_i_price">Price</dt>
                                        <dd class="hc_i_price">
                                            <img src="<%=h.getHotelInfo().getHotelImageUrl()%>"  >
                                        </dd>


                                    </dl>
                                    <div class="cDiv"></div>
                                </div>
                            </div>
                        </div>

                </div>
                <%}%>
                </tr>
                </table>
                <div class="hc_m_ft"></div></div><b class="b4bh"></b><b class="b3bh"></b><b class="b2bh"></b><b class="b1h"></b>			</div>


        <div id="hc_viewedHotels" class="hc_m_v7 hc_i_layout_v1">
        </div>

        <div class="hc_r_clear"></div>
    </div>
</body>
</html>
