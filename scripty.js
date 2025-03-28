function updateClock() {
    let now = new Date();

    let options = { timeZone: "America/Sao_Paulo", hour12: false };
    let timeString = now.toLocaleTimeString("pt-BR", options);

    document.getElementById("clock").textContent = timeString;
}

setInterval(updateClock, 1000);

updateClock();
