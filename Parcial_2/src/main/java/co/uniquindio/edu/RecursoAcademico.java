package co.uniquindio.edu;

public class RecursoAcademico implements Recurso{

    private String codigo;
    private String titulo;
    private String autor;
    private String editorial;
    private String isbn;
    private String palabraClave;
    private String formato;
    private String licencia;
    private String descripcion;
    private int año;
    private double tamaño;

    private RecursoAcademico (Builder builder){
        this.codigo=builder.codigo;
        this.titulo=builder.titulo;
        this.autor=builder.autor;
        this.editorial=builder.editorial;
        this.isbn=builder.isbn;
        this.palabraClave=builder.palabraClave;
        this.formato=builder.formato;
        this.licencia=builder.licencia;
        this.descripcion=builder.descripcion;
        this.año=builder.año;
        this.tamaño=builder.tamaño;

    }

    public static class Builder {
        private String codigo;
        private String titulo;
        private String autor;
        private String editorial;
        private String isbn;
        private String palabraClave;
        private String formato;
        private String licencia;
        private String descripcion;
        private int año;
        private double tamaño;

        public Builder codigo(String codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder autor(String autor) {
            this.autor = autor;
            return this;
        }

        public Builder editorial(String editorial) {
            this.editorial = editorial;
            return this;
        }

        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder palabraClave(String palabraClave) {
            this.palabraClave = palabraClave;
            return this;
        }

        public Builder formato(String formato) {
            this.formato = formato;
            return this;
        }

        public Builder licencia(String licencia) {
            this.licencia = licencia;
            return this;
        }

        public Builder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public Builder año(int año) {
            this.año = año;
            return this;
        }

        public Builder tamaño(double tamaño) {
            this.tamaño = tamaño;
            return this;
        }

        public RecursoAcademico build() {
            if (codigo == null) {
                throw new IllegalStateException("El codigo y la palabra clave son de manera obligatoria");
            }
            return new RecursoAcademico(this);
        }
    }
    public String getCodigo () {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPalabraClave() {
        return palabraClave;
    }

    public String getFormato() {
        return formato;
    }

    public String getLicencia() {
        return licencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getAño() {
        return año;
    }


    @Override
    public double calcularTamaño() {
        return tamaño;
    }
}
