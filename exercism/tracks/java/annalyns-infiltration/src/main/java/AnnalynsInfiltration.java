class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake || prisonerIsAwake);
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean canFreePrisoner = false;
        if (petDogIsPresent && !archerIsAwake) {
            canFreePrisoner = true;
        } else if (!petDogIsPresent && prisonerIsAwake && !archerIsAwake && !knightIsAwake) {
            canFreePrisoner = true;
        }
        return canFreePrisoner;
    }

}
