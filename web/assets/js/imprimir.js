function imprimir(){
    const $elementoCon = document.body;
    html2pdf()
            .set({
                margin:1,
                filename: 'catalogo1',
                image: {
                    type: 'jpeg',
                    quality: 098
                },
                html2canvas:{
                    scale: 3,
                    letterRendering: true,
                },
                jsPDF:{
                    unit: "in",
                    format: "a3",
                    orientation: 'portrait'
                }
            })
            .from($elementoCon)
            .save()
            .catch(err => console.log(err))
            .finally()
            .then(()=>{
                alert("PDF guardado con exito");
            });
}


