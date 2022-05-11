package net.foxdev.festivalloader.loader.impl.fkpscorpio

import org.springframework.stereotype.Component

@Component
class HurricaneLineUpLoader : FKPScorpioLineUpLoader("HURRICANE", "https://hurricane.de/de/line-up/") {
}

@Component
class HighfieldLineUpLoader : FKPScorpioLineUpLoader("HIGHFIELD", "https://hurricane.de/de/line-up/") {
}

@Component
class SouthSideLineUpLoader : FKPScorpioLineUpLoader("SOUTHSIDE", "https://southside.de/de/line-up/")

@Component
class MetalHammerParadiseLineUpLoader : FKPScorpioLineUpLoader("METAL_HAMMER_PARADISE", "https://metal-hammer-paradise.de/de/line-up/")

@Component
class PlageNoireLineUpLoader : FKPScorpioLineUpLoader("PLAGENOIRE", "https://plagenoire.de/de/line-up/")

// The following festival websites of fkp scorpio are using a different mechanism:

class MeraLunaLineUpLoader : FKPScorpioLineUpLoader("MERALUNA", "https://meraluna.de/de/line-up/")

class RollingStoneBeachLineUpLoader : FKPScorpioLineUpLoader("ROLLINGSTONE_BEACH".uppercase(), "https://rollingstone-beach.de/de/line-up/")

class RollingStoneParkLineUpLoader : FKPScorpioLineUpLoader("ROLLINGSTONE_PARK".uppercase(), "https://rollingstone-park.de/de/line-up/")