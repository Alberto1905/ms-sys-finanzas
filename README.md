# ms-sys-finanzas

## Documentación

Esta API expone un endpoint `/anticipos` que recibe parámetros de consulta (queryParams) como `fechaAplicacionPago` y `claveEmpresa`. La solicitud se realizaría mediante la siguiente URL: `http://localhost:8080/anticipos?fechaAplicacionPago=2023-09-11&claveEmpresa=1`

***Hasta el momento, la API solo puede mostrar datos con la fecha 2023-09-11 y la empresa COPPEL (clave 1).***

La respuesta a esta petición es un JSON con la siguiente estructura:

```json
[
    {
        "control": 1,
        "nomempresa": "COPPEL",
        "banco": "BANCOPPEL",
        "importe": 424400.00,
        "fechaTransaccion": "2023-08-01"
    },
    {
        "control": 2,
        "nomempresa": "COPPEL",
        "banco": "BANCOPPEL",
        "importe": 787200.00,
        "fechaTransaccion": "2023-08-01"
    },
    {
        "control": 3,
        "nomempresa": "COPPEL",
        "banco": "BANCOPPEL",
        "importe": 476000.00,
        "fechaTransaccion": "2023-08-01"
    }
]
```
