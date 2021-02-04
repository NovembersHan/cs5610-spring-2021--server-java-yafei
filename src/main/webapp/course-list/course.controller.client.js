//alert("Welcome to Javascript!")
//console.log("Welcome to Javascript!")
var courses = [
    {title: 'CS5610', seats: 20, semester: 'Spring'},
    {title: 'CS3200', seats: 23, semester: 'Spring'},
    {title: 'CS4550', seats: 34, semester: 'Fall'},
    {title: 'CS5200', seats: 45, semester: 'Summer'},
    {title: 'CS4500', seats: 56, semester: 'Summer'},
    {title: 'CS1800', seats: 67, semester: 'Fall'}
];
console.log(courses)

var theHeading = jQuery("h1#the-course-list-heading")
//theHeading.remove();
theHeading
    .html("Course List Editor")
    .css("background-color", "red")
    .css("color", "yellow")
    .append("-add, remove courses!")
    .append("<button>Go!<button/>")

var theTableBody = jQuery("tbody")
//theTableBody.remove()
console.log(theHeading)