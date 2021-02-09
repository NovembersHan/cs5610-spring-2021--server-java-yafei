var $usernameFld, $passwordFld;
var $firstNameFld, $lastNameFld, $roleFld;
var $removeBtn, $editBtn, $createBtn, $updateBtn;
var $userRowTemplate, $tbody;
var userService = new AdminUserServiceClient();

var users = [];
var selectedUser = null;

function createUser() {
    var user = {
        username: $usernameFld.val(),
        password: $passwordFld.val(),
        firstName: $firstNameFld.val(),
        lastName: $lastNameFld.val(),
        role: $roleFld.val()
    }
    userService.createUser(user)
        .then(function (actualUser) {
            users.push(actualUser)
            renderUsers(users)
        })
    $usernameFld.val("")
    $passwordFld.val("")
    $firstNameFld.val("")
    $lastNameFld.val("")
    $roleFld.val("FACULTY")
}

function deleteUser(event) {
    var deleteBtn = jQuery(event.target)
    var theIndex = deleteBtn.attr("id")
    var theId = users[theIndex]._id

    userService.deleteUser(theId)
        .then(function (status) {
            users.splice(theIndex, 1)
            renderUsers(users)
        })
}

function selectUser(event) {
    var selectBtn = jQuery(event.target)
    var theId = selectBtn.attr("id")
    selectedUser = users.find(user => user._id === theId)
    $usernameFld.val(selectedUser.username)
    $passwordFld.val(selectedUser.password)
    $firstNameFld.val(selectedUser.firstName)
    $lastNameFld.val(selectedUser.lastName)
    $roleFld.val(selectedUser.role)
}

function updateUser() {
    selectedUser.username = $usernameFld.val()
    selectedUser.password = $passwordFld.val()
    selectedUser.firstName = $firstNameFld.val()
    selectedUser.lastName = $lastNameFld.val()
    selectedUser.role = $roleFld.val()
    userService.updateUser(selectedUser._id, selectedUser)
        .then(function (status) {
            var index = users.findIndex(user => user._id === selectedUser._id)
            users[index] = selectedUser
            renderUsers(users)
        })
    $usernameFld.val("")
    $passwordFld.val("")
    $firstNameFld.val("")
    $lastNameFld.val("")
    $roleFld.val("FACULTY")
}

function renderUsers(users) {
    $tbody.empty()
    for (var i = 0; i < users.length; i++) {
        var user = users[i]
        $tbody.append(`
            <tr>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.role}</td>
                <td>
                    <span class="pull-right">
                        <i class="fa-2x fa fa-times wbdv-remove" id="${i}"></i>
                        <i class="fa-2x fa fa-pencil wbdv-edit" id="${user._id}"></i>
                    </span>
                </td>
            </tr>
        `)
    }
    $removeBtn = $(".wbdv-remove")
    $removeBtn.click(deleteUser)
    $editBtn = $(".wbdv-edit")
    $editBtn.click(selectUser)
}

function main() {
    $usernameFld = $("#usernameFld")
    $passwordFld = $("#passwordFld")
    $firstNameFld = $("#firstNameFld")
    $lastNameFld = $("#lastNameFld")
    $roleFld = $("#roleFld")
    $createBtn = $(".wbdv-create")
    $updateBtn = $(".wbdv-update")
    $userRowTemplate = $(".wbdv-template")
    $tbody = jQuery("tbody")

    $createBtn.click(createUser)
    $updateBtn.click(updateUser)

    userService.findAllUsers()
        .then(function (actualUsersFromServer) {
            users = actualUsersFromServer
            renderUsers(users)
        })
}

jQuery(main)