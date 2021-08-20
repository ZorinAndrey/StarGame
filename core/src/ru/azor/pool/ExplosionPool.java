package ru.azor.pool;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.azor.base.SpritesPool;
import ru.azor.sprite.Explosion;

public class ExplosionPool extends SpritesPool<Explosion> {

    private final TextureAtlas atlas;
    private final Sound explosionSound;

    public ExplosionPool(TextureAtlas atlas, Sound explosionSound) {
        this.atlas = atlas;
        this.explosionSound = explosionSound;
    }

    @Override
    protected Explosion newSprite() {
        return new Explosion(atlas, explosionSound);
    }
}
