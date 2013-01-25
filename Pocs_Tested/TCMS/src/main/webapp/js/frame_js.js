
	function clearTableData()
	{
	  $("#testSuiteData > tbody").empty();
	}

	/*
	function processeee(data) {       
			if(data!=null){		
				var slist=[];
				slist = data.tcaseList;;
				for (var i=0;i<slist.length;i++){
					 $("#gridtable").append("<tr><td>" + slist[i].name + 
												"</td><td>" + slist[i].tSuiteId + "</td></tr>");
				}
			}
		}

	*/


	 function handleJsonResult(testsuiteId) {	   
			fillGridOnEvent(testsuiteId);
		}

 	function process(data) {             
        var calist = $('#testSuiteData');	
		clearTableData();
		if(data!=null){		
			var slist=[];
	     	slist = data.testSuiteList;
			for (var i=0;i<slist.length;i++){
				calist.append("<tr><td><a href='#' onclick='handleJsonResult("+slist[i].tSuiteId+")>"+slist[i].name+"</a></td></tr>");
			}
		}
    }

	function getTestSuites(prdId) {	
				$("input[id=productId]").val(prdId);
		$.getJSON("getTestSuiteList.action?productId="+prdId,process); 
    }


	function fillGridOnEvent(testsuiteId){
	              $("input[id=testSuiteId]").val(testsuiteId);
	                jQuery("#list").jqGrid({
	                    url:"getTestCaseList.action?testsuiteId="+testsuiteId,
	                    datatype: "json",
                        height: 250,
	                    colNames:['Id','Title','Description','Type','ExecType'],
	                     colModel:[
						  { name: 'testcaseid', index: 'testcaseid', width: 75, align: 'left',
									sorttype: "int", hidden: true, key: true},
							{name:'name',index:'name', width:90,sortable:true,editable:true,search:true,searchoptions:{sopt:['eq','ne','lt','gt']}},
	                        {name:'description',index:'description', width:130,sortable:false,editable:true,edittype:'textarea'},
		                    {name:'type',index:'type', width:130,sortable:true,editable:true,edittype:'select', editoptions:{value:'positive:positive;negative:negative'}},
			                {name:'execType',index:'execType', width:130,sortable:false,editable:true, edittype:'select', editoptions:{value:'automated:automated;nonautomated:nonautomated'}}
	                    ],
	                    jsonReader : {
									  root:"tcaseList",
									  page: "currpage",
									  total: "totalpage",
									  records: "totalrec",
									  repeatitems: false,
									  cell:"",
									  id:"1"
								   },
						multiselect: true,
	                    paging: true,
	                    rowNum:10,
	                    rowList:[10,20,30],
	                    pager: "#pager",
						emptyrecords: "No records to view",
						pgtext : "",
	                    caption: "Test Case Details",
						navigatorAddOptions:{height:280,reloadAfterSubmit:true,closeAfterAdd:true},	
						bCancel:"Close",
						addCaption:"Add New Test Case",
						editurl: "../services/TCMS/addTestCase?testsuiteId="+testsuiteId,
						closeAfterAdd: true,
						closeAfterEdit: true,
						reloadAfterSubmit: true,
						
	                }).navGrid('#pager',{edit:false,add:true,del:false
					});
					
					//.navButtonAdd('#pager',{caption:"",buttonicon:"ui-icon-newwin", onClickButton:showTestCaseHistory, position: "last", title:"" });
					
					
					

					$('#list').setGridParam({url:"getTestCaseList.action?testsuiteId="+testsuiteId,
											editurl: "../services/TCMS/addTestCase?testsuiteId="+testsuiteId											
											});
					$('#list').trigger("reloadGrid");
					$("#testform").show();
	            }

	function showTestCaseHistory(){
	var gsr = jQuery("#list").getGridParam('selarrrow');
	alert(gsr);
	var postdata = jQuery("#list").getPostData();
	alert(postdata);
	}

	function testsubmit(){
		var values = jQuery("#list").getGridParam('selarrrow');
		//alert(values);
		if(values==null || values=='')
		{
		alert("Please select test case to get history.");
		return false;
		}

		$("input[id=tcIds]").val(values);
		
	}
				
