function goBack() {
	window.history.back();
}
/*
function validateInput() {
	var origen = document.getElementById("origen").selectedIndex;
	var destino = document.getElementById("destino").selectedIndex;
	if (origen == destino) {
		document.getElementById("destino").value = "";
	}
}

function validateDate() {
	var startDate = document.getElementById("StartDate").value;
	var endDate = document.getElementById("EndDate").value;
	if (Date.parse(startDate) >= Date.parse(endDate)) {
		document.getElementById("EndDate").value = "";
	}
}
*/
function randomBanner() {
	var imgCount = 3;
	var dir = 'images/';
	var randomCount = Math.round(Math.random() * (imgCount - 1)) + 1;
	var images = new Array
	images[1] = "banner1.jpg";
	images[2] = "banner2.jpg";
	images[3] = "banner3.jpg";
	document.getElementById("divImg").style.backgroundImage = "url(" + dir + images[randomCount] + ")";
}

function tipoMaterial() {
	if (document.getElementById("tipoBibliografico").checked) {
		document.getElementById("bibliografico").style.display = "table-cell";
	} else {
		document.getElementById("bibliografico").style.display = "none";
	}

	if (document.getElementById("tipoAudiovisual").checked) {
		document.getElementById("audiovisual").style.display = "table-cell";
	} else {
		document.getElementById("audiovisual").style.display = "none";
	}
}

function nextEstudiante() {
	if(document.getElementById("codigo").value != ""){
		document.getElementById("codigo2").value = document.getElementById("codigo").value;
		document.getElementById("usuario").style.display = "none";
		document.getElementById("estudiante").style.display = "table-row";
	}
}
