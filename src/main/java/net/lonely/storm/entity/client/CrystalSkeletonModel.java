package net.lonely.storm.entity.client;

import net.lonely.storm.StormMod;
import net.lonely.storm.entity.custom.CrystalSkeletonEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class CrystalSkeletonModel extends GeoModel<CrystalSkeletonEntity> {
    @Override
    public ResourceLocation getModelResource(CrystalSkeletonEntity animatable) {
        return new ResourceLocation(StormMod.MOD_ID, "geo/crystal_skeleton.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CrystalSkeletonEntity animatable) {
        return new ResourceLocation(StormMod.MOD_ID, "textures/entity/crystal_skeleton.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CrystalSkeletonEntity animatable) {
        return new ResourceLocation(StormMod.MOD_ID, "animations/crystal_skeleton.animation.json");
    }

    @Override
    public void setCustomAnimations(CrystalSkeletonEntity animatable, long instanceId, AnimationState<CrystalSkeletonEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}