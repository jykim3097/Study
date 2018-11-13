$( document ).ready(function() {
    $(window).resize();
 }); 

$(window).resize(function(){
    var winWidth = $(window).width();
    var winHeight = $(window).height();

     //change logo size in 00_0_splash.html
    $('.logo').each(function() {
        $(this).css({
            'width': winWidth*0.209 +'px',
            'height' : winHeight*0.159+'px'
        });
    });
    $('.logo').css({position:'absolute'}).css({
        left: (winWidth - $('.logo').outerWidth())/2,
        top: (winHeight - $('.logo').outerHeight())/2
    });

    //change background img size
    $('.splash_bg').css({
        'width' : winWidth,
        'height' : winHeight
    })
})
//common
$(document).ready(function(){
    $('.btn_text_form').css({
        //'padding-top':$('.btn_form').height()*0.318+'px'
        'padding-top':($('.btn_form').height() - $('.btn_text_form').height())/2
    })
    $('.btn_findText_form').css({
        //'margin-top':$('.btn_find_form').height()*0.318+'px'
        'margin-top':($('.btn_find_form').height() - $('.btn_findText_form').height())/2
    })
    $('.btn_joinText_form').css({
        //'margin-top':$('.btn_join_form').height()*0.318+'px'
        'margin-top':($('.btn_join_form').height() - $('.btn_joinText_form').height())/2
    })
})
//in login
$(document).ready(function() {
    $('.logotypegd_login').css({
        'width':$(window).width()*0.197+'px',
        'height':$('.rec1_img_login').height()*0.304+'px',
        'margin-left':$(window).width()*0.416+'px',
        'margin-top':$('.rec1_img_login').height()*0.339+'px',
    })

})

//in join
$(document).ready(function() {
    $('.ic_back').css({
        'width':$(window).width()*0.075+'px',
        'height':$('.header').height()*0.459+'px',
        'margin-top':$('.header').height()*0.286+'px'
    })

    $('.header_title').css({
        'margin-left':$(window).width()*0.291+'px',
        'margin-top':$('.header').height()*0.339+'px'
    })
})