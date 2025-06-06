## Estructura del Proyecto
- `Usuario.g4`: Archivo de gramática ANTLR para usuarios.
- `CustomUsuarioVisitor.js`: Lógica personalizada para recorrer el árbol de análisis.
- `index.js`: Script principal para ejecutar el parser.
- `input.txt`: Archivo de entrada de ejemplo.
- `generated/`: Carpeta con archivos generados por ANTLR (lexer, parser, etc).

## Requisitos
- Node.js
- Java (para ejecutar ANTLR)

## Instalación y Uso
1. Instala las dependencias:
   ```bash
   npm start
   ```

## Ejemplo de Entrada
```
usuario Juan {
  nombre = "Juan Perez";
  edad = 30;
  activo = verdadero;
}
```

## Notas
- Los archivos de entrada válidos y de prueba están en la raíz del proyecto.
- Modifica `input.txt` para probar diferentes entradas.

---
