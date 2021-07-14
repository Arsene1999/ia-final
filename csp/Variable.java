package aima.core.search.csp;

/**
 * A variable is a distinguishable object with a name.
 *
 * @author Ruediger Lunde
 */
public class Variable {
    private final String name;
    private final int numero;

    public Variable(String name,int numero) {
        this.name = name;
        this.numero = numero;
        
    }

    public final String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    /** Variables with equal names are equal. */
    @Override
    public final boolean equals(Object obj) {
        return (obj != null && obj.getClass() == getClass()) && name.equals(((Variable) obj).name) && numero == ((Variable) obj).numero;
    }

    @Override
    public final int hashCode() {
        return name.hashCode();
    }
}
