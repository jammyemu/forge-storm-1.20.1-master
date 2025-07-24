package net.lonely.storm.entity.client;

import net.lonely.storm.StormMod;
import net.lonely.storm.entity.custom.CrystalSkeletonEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import com.mojang.blaze3d.vertex.PoseStack;

public class CrystalSkeletonRenderer extends GeoEntityRenderer<CrystalSkeletonEntity> {
    public CrystalSkeletonRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CrystalSkeletonModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CrystalSkeletonEntity animatable) {
        return new ResourceLocation(StormMod.MOD_ID, "textures/entity/crystal_skeleton.png");
    }

    @Override
    public void render(CrystalSkeletonEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}