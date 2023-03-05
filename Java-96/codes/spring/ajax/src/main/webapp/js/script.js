var xhr;

function getEmployeeDetails(empno){
	xhr = new XMLHttpRequest();
	xhr.open("GET", "search?eno="+empno, true); 
	xhr.onreadystatechange=stateChanged; //to register a callback function for state change
	xhr.send();	
}

function stateChanged(){
	var ename='NO MATCH';
    var esal='NO MATCH';
    	
	if(xhr.readyState==4 && xhr.status==200){
	  var response = xhr.responseText;
	  if(response.length > 0){
		  var jObj = JSON.parse(response);
		  ename = jObj.emp_name;
		  esal = jObj.emp_sal;
	  }	
	  document.getElementById('emp_name').innerHTML = ename;
	  document.getElementById('emp_sal').innerHTML = esal;  
	}

}