function display() {
    let name = document.getElementById("name").value;
    let cmnd = document.getElementById("cmnd").value;
    let date = document.getElementById("date").value;
    let email = document.getElementById("email").value;
    let address = document.getElementById("address").value;
    let customer = document.getElementById("customer").value;
    let people = document.getElementById("people").value;
    let rent = document.getElementById("rent").value;
    let service = document.getElementById("service").value;
    let room = document.getElementById("room").value;
    let code = document.getElementById("code").value;

    if (!isNaN(cmnd)) {
        cmnd = Number.parseFloat(cmnd);
    }
    if (!Number.parseFloat(cmnd)) {
        alert("Wrong ID!!!")
    } else if (cmnd < 10000000 || cmnd > 99999999) {
        alert("Wrong ID!!!")
    } else {

        var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
        if (!filter.test(email)) {
            alert('Enter your right format mail.\nExample@gmail.com');
            email.focus;
            return false;
        } else {
            if (!isNaN(people)) {
                people = Number.parseFloat(people);
            }
            if (!Number.parseFloat(people)) {
                alert("Wrong amount passenger!!!")
            } else if (people < 0) {
                alert("Wrong amount passenger!!!")
            } else {
                //kt dịnh f=dạng số ngày thuê
                if (!isNaN(rent)) {
                    people = Number.parseFloat(rent);
                }
                if (!Number.parseFloat(rent)) {
                    alert("RentDays is wrong!!!")
                } else if (rent <= 0) {
                    alert("RentDays is wrong!!!")
                } else {
                    // format lai ten khach hang
                    let tempName = "";
                    name = name.trim().toLowerCase();
                    for (let i = 0; i < name.length; i++) {
                        if (name.charAt(i) === " " && name.charAt(i + 1) === " ") {
                            continue;
                        }
                        if (i === 0 || name.charAt(i - 1) === " ") {
                            tempName += name.charAt(i).toUpperCase();
                            continue;

                        }
                        tempName += name.charAt(i);
                    }


                    document.getElementById("displayName").innerText = tempName;
                    document.getElementById("displayCmnd").innerText = cmnd;
                    document.getElementById("displayDate").innerText = date;
                    document.getElementById("displayEmail").innerText = email;
                    document.getElementById("displayAddress").innerText = address;
                    document.getElementById("displayCustomer").innerText = customer;
                    document.getElementById("displayPeople").innerText = people;
                    document.getElementById("displayRent").innerText = rent;
                    document.getElementById("displayService").innerText = service;
                    document.getElementById("displayRoom").innerText = room;
                    document.getElementById("name").value = "";
                    document.getElementById("cmnd").value = "";
                    document.getElementById("date").value = "";
                    document.getElementById("email").value = "";
                    document.getElementById("address").value = "";
                    document.getElementById("customer").value = "";
                    document.getElementById("people").value = "";
                    document.getElementById("rent").value = "";
                    document.getElementById("service").value = "";
                    document.getElementById("room").value = "";
                    document.getElementById("code").value = "";

                    let saleAdd = 0;
                    switch (address) {
                        case "Đà Nẵng":
                            saleAdd = 20;
                            break;
                        case "Huế":
                            saleAdd = 10;
                            break;
                        case "Quảng Nam":
                            saleAdd = 5;
                            break;
                        default:
                            saleAdd = 0;
                    }
//giảm giá theo số ngày
                    let saleRent = 0;
                    if (rent > 7) {
                        saleRent = 30;
                    } else if (rent > 5) {
                        saleRent = 20;
                    } else if (rent > 2) {
                        saleRent = 10;
                    } else {
                        saleRent = 0;
                    }
//giảm giá theo loại khách hàng
                    let saleCus = 0;
                    switch (customer) {
                        case "Diamond":
                            saleCus = 15;
                            break;
                        case "Platinum":
                            saleCus = 10;
                            break;
                        case "Gold":
                            saleCus = 5;
                            break;
                        case "Silver":
                            saleCus = 2;
                            break;
                        case "Member":
                            saleCus = 0;
                            break;
                    }
//giảm giá khi nhập mã giảm giá
                    let saleCode = 0;
                    switch (code) {
                        case "FURAMA":
                            saleCode = 20;
                            break;
                        case "DANANG":
                            saleCode = 10;
                            break;
                        case "SONGHAN":
                            saleCode = 5;
                            break;
                        default:
                            saleCode = 0;
                    }
//tính tổng tiền phải trả
                    let allsale = 0;
                    allsale = saleAdd + saleCus + saleRent + saleCode;
                    let outPay = 0;
                    switch (service) {
                        case "Villa" :
                            outPay = 500 * rent - allsale;
                            break;
                        case "House" :
                            outPay = 300 * rent - allsale;
                            break;
                        case "Room" :
                            outPay = 100 * rent - allsale;
                            break;
                    }
                    document.getElementById('displaySale').innerText = allsale;
                    document.getElementById('displayPay').innerText = outPay;

                }
            }
        }
    }
}


//xuất dữ liệu lên lại khi nhấn edit
function edit() {
    let displayName = document.getElementById("displayName").textContent;
    document.getElementById("name").value = displayName;
    let displayCmnd = document.getElementById("displayCmnd").textContent;
    document.getElementById("cmnd").value = displayCmnd;
    let displayDate = document.getElementById("displayDate").textContent;
    document.getElementById("date").value = displayDate;
    let displayEmail = document.getElementById("displayEmail").textContent;
    document.getElementById("email").value = displayEmail;
    let displayAddress = document.getElementById("displayAddress").textContent;
    document.getElementById("address").value = displayAddress;
    let displayCustomer = document.getElementById("displayCustomer").textContent;
    document.getElementById("customer").value = displayCustomer;
    let displayPeople = document.getElementById("displayPeople").textContent;
    document.getElementById("people").value = displayPeople;
    let displayRent = document.getElementById("displayRent").textContent;
    document.getElementById("rent").value = displayRent;
    let displayService = document.getElementById("displayService").textContent;
    document.getElementById("service").value = displayService;
    let displayRoom = document.getElementById("displayRoom").textContent;
    document.getElementById("room").value = displayRoom;
}