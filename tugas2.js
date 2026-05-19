let golongan = "B";
let jamLembur = 3;

let gajiPokok = 0;
let persenLembur = 0;
let gajiLembur = 0;
let totalGaji = 0;

if (golongan === "A") {
  gajiPokok = 5000000;
} else if (golongan === "B") {
  gajiPokok = 6500000;
} else if (golongan === "C") {
  gajiPokok = 9500000;
}

if (jamLembur === 1) {
  persenLembur = 0.30;
} else if (jamLembur === 2) {
  persenLembur = 0.32;
} else if (jamLembur === 3) {
  persenLembur = 0.34;
} else if (jamLembur === 4) {
  persenLembur = 0.36;
} else if (jamLembur >= 5) {
  persenLembur = 0.38;
}

gajiLembur = gajiPokok * persenLembur;
totalGaji = gajiPokok + gajiLembur;

console.log("Golongan Karyawan : " + golongan);
console.log("Gaji Pokok        : Rp." + gajiPokok);
console.log("Jam Lembur        : " + jamLembur + " Jam");
console.log("Gaji Lembur       : Rp." + gajiLembur);
console.log("Total Penghasilan : Rp." + totalGaji);