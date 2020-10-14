function tinhsongay() {
    let a = parseInt(document.getElementById('number1').value);
    let result;
    switch (a) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            result = 'Thang co 31 ngay';
            break;

        case 2:
            result = 'Thang co 28 hoac 29 ngay';
            break;
        case 4:
        case 6:
        case 11:
            result = 'Thang co 30 ngay <br>';
            break;
    }
    document.getElementById("result").innerHTML =result;
}

