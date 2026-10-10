#language:es

@bancolombia
Característica: Feature bancolombia

  Como usuario de bancolombia
  quiero navegar por la web
  para validar los flujos principales

  @HappyPath @Prueba
  Escenario: Validacion de documento
    Cuando el usuario ingresa a la pagina de bancolombia
    Y el usuario selecciona aceptar todo del aviso visible
    Y el usuario selecciona la opcion personas
    Y el usuario selecciona la opcion productos y servicios
    Y el usuario selecciona la opcion inversiones
    Y el usuario selecciona la opcion productos digitales de inversion
    Y el usuario selecciona la opcion inversion virtual
    Y el usuario abre el reglamento
    Entonces visualiza el documento esperado
