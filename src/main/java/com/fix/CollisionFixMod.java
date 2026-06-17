package com.fix;
import net.neoforged.fml.common.Mod;

@Mod(CollisionFixMod.MOD_ID)
public class CollisionFixMod {
    public static final String MOD_ID = "create_collision_fix";
    public CollisionFixMod() {
        // 零事件注册，彻底杜绝dark_ages矿石拦截
    }
}