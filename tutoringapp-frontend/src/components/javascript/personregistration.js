//Testing this out right now
//Author : Osman

//Dtos
function PersonDto(firstName, lastName, userName) {
this.firstName = firstName;
this.lastName = lastName;
this.userName = userName;
}

//data variables
export default {
name: 'personregistration',
data () {
	return {
		people: [],
		newPerson: '',
		errorPerson: '',
		response: []
		}
	},
created: function() {
	//Test data
	const p1 = new PersonDto('Osman');
	const p2 = new PersonDto('Marwan');
	//Sample initial content
	this.people = [p1,  p2];

},


//event handling method
methods: {
	createPerson: function(personName) {
	//Create a new person and add it to the list of people
	var p = new PersonDto(personName);
	this.people.push(p);
	//Reset the name field for the new people
	this.newPerson = '';
	}
}
}
