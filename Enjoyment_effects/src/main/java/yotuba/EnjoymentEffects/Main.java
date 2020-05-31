package yotuba.EnjoymentEffects;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.EventHandler;
import cn.nukkit.potion.InstantEffect;
import cn.nukkit.event.potion.PotionApplyEvent;
import cn.nukkit.potion.Effect;
import cn.nukkit.entity.Entity;

public class Main extends PluginBase {
    @Override
    public void onEnable(){
        new InstantEffect(24, "guilt", 44, 0, 28, true);
        new InstantEffect(25, "reflain", 210, 224, 255, true);
        new InstantEffect(26, "drain", 100, 0, 0);
    }

    @EventHandler
    public boolean onPotionApply(PotionApplyEvent event){
        Effect effect = event.getApplyEffect();
        Entity entity = event.getEntity();
        int duration =

        switch(effect){
            case "guilt":

                break;
            case "reflain":

                break;
            case "drain":

                break;
        }
        return true;
    }
}
