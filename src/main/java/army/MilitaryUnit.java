package army;

public abstract class MilitaryUnit {
    private int lifePoints;
    private int damage;
    private boolean pancel;

    public MilitaryUnit(int lifePoints, int damage, boolean pancel) {
        this.lifePoints = lifePoints;
        this.damage = damage;
        this.pancel = pancel;
    }

    public abstract int doDamage() ;

    public abstract int sufferDamage(int damage);

}
