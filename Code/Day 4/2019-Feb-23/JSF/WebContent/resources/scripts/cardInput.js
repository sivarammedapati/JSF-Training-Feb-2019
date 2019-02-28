
function displayExpiry(id){
	console.log(id);
	
	var monthExpirySelector = id + ":cardInputForm:monthExpiry_input";
	var yearExpirySelector = id + ":cardInputForm:yearExpiry_input";
	
	var month = $(PrimeFaces.escapeClientId(monthExpirySelector)).val();
	var year = $(PrimeFaces.escapeClientId(yearExpirySelector)).val();
	
	console.log("month: ", month);
	console.log("year: ", year);
	
	if(month != "-1" && year != "-1"){
		
		var output = $(PrimeFaces.escapeClientId(id + ":cardInputForm:expiryLabel"));
		output.text(month + "/" + year);
	}	
}