abstract class Fighter {
    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

    public String toString() {
        String string1 = "Fighter is a Fighter";
        return string1;
    }

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        String string1 = "Fighter is a Warrior";
        return string1;
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable()? 10 : 6;
    }
}

class Wizard extends Fighter {
    boolean spell_well = false;
    @Override
    boolean isVulnerable() {
        return !spell_well;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return (spell_well)? 12 : 3;

    }
    public String toString() {
        String string1 = "Fighter is a Wizard";
        return string1;
    }

    void prepareSpell() {
        spell_well = true;
    }

}
