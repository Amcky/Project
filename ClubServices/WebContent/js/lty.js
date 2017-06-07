var kangning = function($) {
    return {
        common: function() {
            var _win = $(window),
				_body = (window.opera) ? (document.compatMode == "CSS1Compat" ? $('html') : $('body')) : $('html,body'),
				_goToTop = $(".goToTop");
			
            //search
            var _searchText = $(".headerSearch .text");
            _searchText.focus(function() {
                if ($(this).val() == "全站搜索") {
                    $(this).val("");
                }
            }).blur(function() {
                if ($(this).val() == "") {
                    $(this).val("全站搜索");
                }
            });

            //nav
            var _nav = $(".li_h"),
				_nav1 = $(".li_h1"),
				_nav2 = $(".li_h2"),
				_nav3 = $(".li_h3"),
				_nav4 = $(".li_h4"),
				_nav5 = $(".li_h5"),
				_nav6 = $(".li_h6"),
				_navHover1 = $(".navHover1"),
				_navHover2 = $(".navHover2"),
				_navHover3 = $(".navHover3"),
				_navHover4 = $(".navHover4"),
				_navHover5 = $(".navHover5"),
				_navHover6 = $(".navHover6");

           

            

   
			_nav1.hover(function() {
                _navHover1.stop(1, 1).slideDown("fast");
            }, function() {
                _navHover1.stop(1, 1).slideUp("fast");
            });

            _nav1.find("li a").hover(function() {
                $(this).find("i").stop(1, 1).slideDown("fast");
            }, function() {
                $(this).find("i").stop(1, 1).slideUp("fast");
            });

            _navHover1.find("dl").each(function() {
                var _this = $(this),
					_index = _this.index();
                _this.hover(function() {
                    _nav1.find("li a i").stop(1, 1).slideUp("fast");
                    _nav1.find("li").eq(_index).find("a i").stop(1, 1).slideDown("fast");
                }, function() {
                    _nav1.find("li a i").stop(1, 1).slideUp("fast");
                });
            });

			_nav2.hover(function() {
                _navHover2.stop(1, 1).slideDown("fast");
            }, function() {
                _navHover2.stop(1, 1).slideUp("fast");
            });

            _nav2.find("li a").hover(function() {
                $(this).find("i").stop(1, 1).slideDown("fast");
            }, function() {
                $(this).find("i").stop(1, 1).slideUp("fast");
            });

            _navHover2.find("dl").each(function() {
                var _this = $(this),
					_index = _this.index();
                _this.hover(function() {
                    _nav2.find("li a i").stop(1, 1).slideUp("fast");
                    _nav2.find("li").eq(_index).find("a i").stop(1, 1).slideDown("fast");
                }, function() {
                    _nav2.find("li a i").stop(1, 1).slideUp("fast");
                });
            });
			
			_nav3.hover(function() {
                _navHover3.stop(1, 1).slideDown("fast");
            }, function() {
                _navHover3.stop(1, 1).slideUp("fast");
            });

            _nav3.find("li a").hover(function() {
                $(this).find("i").stop(1, 1).slideDown("fast");
            }, function() {
                $(this).find("i").stop(1, 1).slideUp("fast");
            });

            _navHover3.find("dl").each(function() {
                var _this = $(this),
					_index = _this.index();
                _this.hover(function() {
                    _nav3.find("li a i").stop(1, 1).slideUp("fast");
                    _nav3.find("li").eq(_index).find("a i").stop(1, 1).slideDown("fast");
                }, function() {
                    _nav3.find("li a i").stop(1, 1).slideUp("fast");
                });
            });
			
			_nav4.hover(function() {
                _navHover4.stop(1, 1).slideDown("fast");
            }, function() {
                _navHover4.stop(1, 1).slideUp("fast");
            });

            _nav4.find("li a").hover(function() {
                $(this).find("i").stop(1, 1).slideDown("fast");
            }, function() {
                $(this).find("i").stop(1, 1).slideUp("fast");
            });

            _navHover4.find("dl").each(function() {
                var _this = $(this),
					_index = _this.index();
                _this.hover(function() {
                    _nav4.find("li a i").stop(1, 1).slideUp("fast");
                    _nav4.find("li").eq(_index).find("a i").stop(1, 1).slideDown("fast");
                }, function() {
                    _nav4.find("li a i").stop(1, 1).slideUp("fast");
                });
            });
			
			_nav5.hover(function() {
                _navHover5.stop(1, 1).slideDown("fast");
            }, function() {
                _navHover5.stop(1, 1).slideUp("fast");
            });

            _nav5.find("li a").hover(function() {
                $(this).find("i").stop(1, 1).slideDown("fast");
            }, function() {
                $(this).find("i").stop(1, 1).slideUp("fast");
            });

            _navHover5.find("dl").each(function() {
                var _this = $(this),
					_index = _this.index();
                _this.hover(function() {
                    _nav5.find("li a i").stop(1, 1).slideUp("fast");
                    _nav5.find("li").eq(_index).find("a i").stop(1, 1).slideDown("fast");
                }, function() {
                    _nav5.find("li a i").stop(1, 1).slideUp("fast");
                });
            });
			
			_nav6.hover(function() {
                _navHover6.stop(1, 1).slideDown("fast");
            }, function() {
                _navHover6.stop(1, 1).slideUp("fast");
            });

            _nav6.find("li a").hover(function() {
                $(this).find("i").stop(1, 1).slideDown("fast");
            }, function() {
                $(this).find("i").stop(1, 1).slideUp("fast");
            });

            _navHover6.find("dl").each(function() {
                var _this = $(this),
					_index = _this.index();
                _this.hover(function() {
                    _nav6.find("li a i").stop(1, 1).slideUp("fast");
                    _nav6.find("li").eq(_index).find("a i").stop(1, 1).slideDown("fast");
                }, function() {
                    _nav6.find("li a i").stop(1, 1).slideUp("fast");
                });
            });
			
			//erNav
           var  _dl1 = $(".dl_d1"),
				_dl2 = $(".dl_d2"),
				_dl3 = $(".dl_d3"),
				_erNav1 = $(".erNav1"),
				_erNav2 = $(".erNav2"),
				_erNav3 = $(".erNav3");

   
            _dl1.hover(function() {
                _erNav1.stop(1, 1).slideDown("fast");
            }, function() {
                _erNav1.stop(1, 1).slideUp("fast");
            });

            _dl1.find(".dl_d1 a").hover(function() {
                $(this).find("b").stop(1, 1).slideDown("fast");
            }, function() {
                $(this).find("b").stop(1, 1).slideUp("fast");
            });

   
	   		_dl2.hover(function() {
                _erNav2.stop(1, 1).slideDown("fast");
            }, function() {
                _erNav2.stop(1, 1).slideUp("fast");
            });

            _dl2.find(".dl_d2 a").hover(function() {
                $(this).find("b").stop(1, 1).slideDown("fast");
            }, function() {
                $(this).find("b").stop(1, 1).slideUp("fast");
            });

            _erNav1.find("dl").each(function() {
                var _this = $(this),
		_index = _this.index();
                _this.hover(function() {
                    _dl1.find("dd a b").stop(1, 1).slideUp("fast");
                    _dl1.find("li").eq(_index).find("a b").stop(1, 1).slideDown("fast");
                }, function() {
                    _dl1.find("dd a b").stop(1, 1).slideUp("fast");
                });
            });

            _erNav2.find("dl").each(function() {
                var _this = $(this),
				_index = _this.index();
                _this.hover(function() {
                    _dl2.find("dd a b").stop(1, 1).slideUp("fast");
                    _dl2.find("li").eq(_index).find("a b").stop(1, 1).slideDown("fast");
                }, function() {
                    _dl2.find("dd a b").stop(1, 1).slideUp("fast");
                });
            });
			
	  		 _dl3.hover(function() {
                _erNav3.stop(1, 1).slideDown("fast");
            }, function() {
                _erNav3.stop(1, 1).slideUp("fast");
            });

            _dl3.find(".dl_d2 a").hover(function() {
                $(this).find("b").stop(1, 1).slideDown("fast");
            }, function() {
                $(this).find("b").stop(1, 1).slideUp("fast");
            });

            _erNav3.find("dl").each(function() {
                var _this = $(this),
		_index = _this.index();
                _this.hover(function() {
                    _nav3.find("dd a b").stop(1, 1).slideUp("fast");
                    _nav3.find("li").eq(_index).find("a b").stop(1, 1).slideDown("fast");
                }, function() {
                    _nav3.find("dd a b").stop(1, 1).slideUp("fast");
                });
            });
			
			
            
			
            //go to top
            _goToTop.click(function() {
                _body.stop().animate({ scrollTop: 0 }, "normal");
            });

            //online
            var _onlineBox = $(".onlineBox");
            _onlineBox.hover(function() {
                $(this).stop(1, 1).animate({ "width": "205" }, "fast");
            }, function() {
                $(this).stop(1, 1).animate({ "width": "34" }, "fast");
            });

            //select
            var _select = $(".select");
            _select.each(function() {
                var _this = $(this),
					_span = _this.find("span"),
					_dl = _this.find("dl");

                _span.click(function() {
                    if (_dl.is(":hidden")) {
                        _dl.show();
                    } else {
                        _dl.hide();
                    }
                });

                $(document).click(function(e) {
                    if ($(e.target).parents(".select").length == 0) {
                        _dl.hide();
                    }
                });
            });
        },
        index: function() {
            kangning.common();

            var _indexBanner = $(".indexBanner"),
				_imgDl = _indexBanner.find("dl"),
				_imgDD = _indexBanner.find("dd");

            _indexBanner.bannerSwitch({
                time: 5000,
                animation: 1500
            });

            _imgDl.css("marginLeft", -(23 * _imgDD.length - 10) / 2);

            $('.indexBrandLink .wrap').kxbdSuperMarquee({
                isMarquee: true,
                isEqual: false,
                scrollDelay: 20,
                controlBtn: { left: '#goUM', right: '#goDM' },
                direction: 'left'
            });

            var _wrap = "",
				_auto = 0,
				_scroll = 5,
				_mycarousel = $("#mycarousel"),
				_mycarouselLength = _mycarousel.find("li").length;

            if (_mycarouselLength > _scroll) {
                _wrap = 'circular';
                _auto = 5;
            } else {
                _wrap = 'null';
                _auto = 0;
            }
            _mycarousel.jcarousel({
                wrap: _wrap,
                auto: _auto,
                scroll: 1,
                animation: 800,
                initCallback: mycarousel_initCallback
            });
        },
        brand: function() {
            kangning.common();
        },
		brandRealIndex: function() {
            kangning.common();

            var _li = $(".brandRealIndex .con li");

            _li.each(function() {
                var _this = $(this);
                _this.hover(function() {
                    _this.addClass("hover");
                    _this.find("a").css("display","inline-block");
                }, function() {
                    _this.removeClass("hover");
                    _this.find("a").hide();
                });
            });
        },
        history: function() {
            kangning.common();

            var _img01 = $(".img01"),
				_img02 = $(".img02"),
				_blank = ($(window).width() - 1080) / 2;

            if (_blank < _img01.width()) {
                _img01.css("width", _blank - 20);
            } else {
                if (_blank < 0) {
                    _img01.width(0);
                }
            }
            if (_blank < _img02.width()) {
                _img02.css("width", _blank - 20);
            } else {
                if (_blank < 0) {
                    _img02.width(0);
                }
            }

        },
        product: function() {
            kangning.common();

            var _listLi = $(".proList li");

            _listLi.each(function() {
                var _this = $(this),
					_img = _this.find("p.img"),
					_hover = _this.find(".hover"),
					_index = _this.index() + 1;

                _img.hover(function() {
                    _hover.stop(1, 1).fadeIn();
                    _listLi.css("zIndex", "10");
                    _this.css("zIndex", "20");
                }, function() {

                });

                _hover.hover(function() {

                }, function() {
                    _hover.stop(1, 1).fadeOut("fast");
                });

                if (_index % 4 == 0) {
                    _hover.css({ "left": "auto", "right": "0" });
                }
            });
			
			 var _listLi1 = $(".list li");
            $(".list li").each(function () {
                var _this = $(this),
					_img = _this.find("p.img"),
					_hover = _this.find(".hover"),
					_index = _this.index() + 1;
                _img.hover(function () {
                    _hover.stop(1, 1).fadeIn();
                    _listLi.css("zIndex", "10");
                    _this.css("zIndex", "20");
                }, function () {

                });

                _hover.hover(function () {
                    $(this).parents("li").css("z-index", "20").siblings("li").css("z-index", "10")
                }, function () {
                    _hover.stop(1, 1).fadeOut("fast");
                });

                if (_index % 4 == 0) {
                    _hover.css({ "left": "auto", "right": "0" });
                }
            });

        },
        
        productIndex: function() {
            kangning.common();

            var _li = $(".proIndex .con li");

            _li.each(function() {
                var _this = $(this);
                _this.hover(function() {
                    _this.addClass("hover");
                    _this.find("dd").show();
                }, function() {
                    _this.removeClass("hover");
                    _this.find("dd").hide();
                });
            });
        },
        newsIndex: function() {
            kangning.common();

            var _newsIndexImg = $(".newsIndexImg"),
				_imgDl = _newsIndexImg.find("dl"),
				_imgDD = _newsIndexImg.find("dd");

            _newsIndexImg.bannerSwitch({
                time: 5000,
                animation: 1500
            });

            _imgDl.css("marginLeft", -(23 * _imgDD.length - 10) / 2);
        },
        newsList: function() {
            kangning.common();
        },
        newsDetail: function() {
            kangning.common();
        },
        brandReal: function() {
            kangning.common();

            if ($.browser.msie && ($.browser.version >= "9.0")) {
                $("object").attr("classid", "clsid:D27CDB6E-AE6D-11cf-96B8-444553540000");
            }

            var _btn = $(".brandRealListTit .btn");
            _btn.click(function() {
                var _this = $(this),
					_index = _this.parents(".brandRealListTit").index(".brandRealListTit"),
					_item = $(".brandRealItem").eq(_index);
                if (_item.height() == "450") {
                    _item.animate({ "height": _item.find(".list").height() }, "fast");
                    _this.text("收起");
                } else {
                    _item.animate({ "height": "450" }, "fast");
                    _this.text("所有产品");
                }
            });

            var _videoInfo = $(".videoInfo"),
				_videoIcon = $(".videoIcon"),
				_videoTit = $(".brandReal01 .video p.tit");

            _videoIcon.find("span").click(function() {
                var _this = $(this);
                _videoInfo.html('<object type="application/x-shockwave-flash" data="../flash/vcastr3.swf" width="400" height="225" id="vcastr3">' +
				'	<param name="movie" value="../flash/vcastr3.swf"> ' +
				'	<param name="allowFullScreen" value="true">' +
				'	<param name="wmode" value="transparent">' +
				'	<param name="FlashVars" value="xml=' +
				'		{vcastr}' +
				'			{channel}' +
				'				{item}' +
				'					{source}' + _this.attr('flv') + '{/source}' +
				'					{duration}{/duration}' +
				'					{title}{/title}' +
				'				{/item}' +
				'			{/channel}' +
				'			{config}' +
				'				{controlPanelBgColor}0x010101{/controlPanelBgColor}' +
				'				{isAutoPlay}false{/isAutoPlay}' +
				'				{isLoadBegin}false{/isLoadBegin}' +
				'			{/config}' +
				'		{/vcastr}">' +
				'</object>');
                _videoTit.html(_this.attr("txt"));
                _videoIcon.find("span").removeClass("current");
                _this.addClass("current");
            }).eq(0).addClass("current");
        },
        login: function() {
            kangning.common();

            var _loginImg = $(".loginImg"),
				_imgDl = _loginImg.find("dl"),
				_imgDD = _loginImg.find("dd");

            _loginImg.bannerSwitch({
                time: 5000,
                animation: 1500
            });

            _imgDl.css("marginLeft", -(23 * _imgDD.length - 10) / 2);
        },
        memberIndex: function() {
            kangning.common();

            var _memberIndexImg = $(".memberIndexImg");
            _memberIndexImg.bannerSwitch({
                time: 5000,
                animation: 1500
            });
        },
        memberEvent: function() {
            kangning.common();
        },
        memberEventDetail: function() {
            kangning.common();

            var _wrap = "",
				_auto = 0,
				_scroll = 4,
				_mycarousel = $("#mycarousel"),
				_mycarouselLength = _mycarousel.find("li").length;

            if (_mycarouselLength > _scroll) {
                _wrap = 'circular';
                _auto = 5;
            } else {
                _wrap = 'null';
                _auto = 0;
            }
            _mycarousel.jcarousel({
                wrap: _wrap,
                auto: _auto,
                scroll: 1,
                animation: 800,
                initCallback: mycarousel_initCallback
            });

            var arrPageSizes = ___getPageSize(),
				_applyBtn = $("#applyBtn"),
				_memberEventPop = $(".memberEventPop"),
				_shadow = $(".shadow");

            _applyBtn.click(function() {
                _shadow.css({ width: arrPageSizes[0], height: arrPageSizes[1] }).fadeTo("slow", 0.8, function() {
                    _memberEventPop.animate({ "top": document.documentElement.scrollTop + document.body.scrollTop + 50 }, "fast");
                });
            });
        },
        memberCookbook: function() {
            kangning.common();
        },
        memberCookbookDetail: function() {
            kangning.common();
        },
        memberPromo: function() {
            kangning.common();
        },
        memberPromoDetail: function() {
            kangning.common();

            var _wrap = "",
				_auto = 0,
				_scroll = 4,
				_mycarousel = $("#mycarousel"),
				_mycarouselLength = _mycarousel.find("li").length;

            if (_mycarouselLength > _scroll) {
                _wrap = 'circular';
                _auto = 5;
            } else {
                _wrap = 'null';
                _auto = 0;
            }
            _mycarousel.jcarousel({
                wrap: _wrap,
                auto: _auto,
                scroll: 1,
                animation: 800,
                initCallback: mycarousel_initCallback
            });
        },
        cookIndex: function() {
            kangning.common();
        },
        cookProgram: function() {
            kangning.common();
        },
        cookStar: function() {
            kangning.common();
        },
        cookOther: function() {
            kangning.common();
        },
        star: function() {
            kangning.common();

            var _starTopImg = $(".starTopImg"),
				_starHot = $(".starHot")
            _starHotImg = _starHot.find("img"),
				_starHotInfo = _starHot.find(".info"),
				_starHotCoverImg = $(".starHotCoverImg"),
				_starHotCoverInfo = $(".starHotCoverInfo");

            _starTopImg.bannerSwitch({
                time: 5000,
                animation: 1500
            });

            hotImg();

            $(window).resize(function() {
                hotImg();
            });

           
            _starHotCoverImg.find("li").click(function() {
                var _index = $(this).index();
                _starHotCoverInfo.stop(1, 1).slideUp();
                _starHotCoverInfo.eq(_index).stop(1, 1).slideDown();
            }).eq(0).trigger("click");

            function hotImg() {
                var _winWindth = $(window).width();
                if (_winWindth < 1500 && _winWindth > 1080) {
                    _starHotImg.animate({ "width": (_winWindth - 50) / 5 - 2, "height": (_winWindth - 50) / 5 - 2 }, "fast");
                    _starHotInfo.css({ "width": "auto" });
                } else if (_winWindth <= 1080) {
                    _starHotImg.animate({ "width": 1080 / 5 - 2, "height": 1080 / 5 - 2 }, "fast");
                    _starHotInfo.css({ "width": "1080" });
                } else {
                    _starHotImg.animate({ "width": "298", "height": "298" }, "fast");
                    _starHotInfo.css({ "width": "auto" });
                }
            }
        }
    }
} (jQuery);


$(function() {
	//weixin
    var arrPageSizes = ___getPageSize(),
	_shadow = $(".shadow"),
	_weixin = $(".weixin"),
	_weixinBtn = $(".wx,#weixinBtn");

     _weixinBtn.click(function() {
        _shadow.css({ width: arrPageSizes[0], height: arrPageSizes[1] }).fadeTo("slow", 0.8, function() {
			_weixin.css("top", document.documentElement.scrollTop + document.body.scrollTop + 50).slideDown("normal");
		});
    });
    _weixin.find(".close").click(function() {
        _weixin.hide();
        _shadow.fadeOut();
    });


    $(".logout").click(function() {
        $.ajax({
            type: "post",
            url: "/ashx/CheckUser.ashx",
            async: false,
            data: "action=logout&rd=" + Math.random(1),
            success: function(data) {
                if (data != "nofalse") {
                    alert(data);
                    location.replace(location.href);
                }
            }
        });
    });
});