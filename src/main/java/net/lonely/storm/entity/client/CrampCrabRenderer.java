package net.lonely.storm.entity.client;

import net.lonely.storm.StormMod;
import net.lonely.storm.entity.custom.CrampCrabEntity;
import net.lonely.storm.entity.custom.CrystalSkeletonEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import com.mojang.blaze3d.vertex.PoseStack;

public class CrampCrabRenderer extends GeoEntityRenderer<CrampCrabEntity> {
    public CrampCrabRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CrampCrabModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CrampCrabEntity animatable) {
        return new ResourceLocation(StormMod.MOD_ID, "textures/entity/cramp_crab.png");
    }

    @Override
    public void render(CrampCrabEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}