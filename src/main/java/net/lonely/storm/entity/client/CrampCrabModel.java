package net.lonely.storm.entity.client;

import net.lonely.storm.StormMod;
import net.lonely.storm.entity.custom.CrampCrabEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class CrampCrabModel extends GeoModel<CrampCrabEntity> {
    @Override
    public ResourceLocation getModelResource(CrampCrabEntity animatable) {
        return new ResourceLocation(StormMod.MOD_ID, "geo/cramp_crab.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CrampCrabEntity animatable) {
        return new ResourceLocation(StormMod.MOD_ID, "textures/entity/cramp_crab.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CrampCrabEntity animatable) {
        return new ResourceLocation(StormMod.MOD_ID, "animations/cramp_crab.animation.json");
    }

    @Override
    public void setCustomAnimations(CrampCrabEntity animatable, long instanceId, AnimationState<CrampCrabEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}