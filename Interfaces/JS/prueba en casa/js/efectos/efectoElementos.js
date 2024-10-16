
export function efectoAnimacion() {
    document.addEventListener('DOMContentLoaded', () => {
        const elements = document.querySelectorAll('.fade-in');

        elements.forEach((element, index) => {
            // Retraso progresivo basado en el índice
            setTimeout(() => {
                element.classList.add('fade-in');
            }, index * 300); // Retrasa 300 ms por cada elemento
        });
    });
}

