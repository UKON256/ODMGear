package jp.ukon.odm_gear.foundations.key;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.IKeyConflictContext;

public class NonConflictKeyMapping extends KeyMapping {
    public NonConflictKeyMapping(String title, int key, String category) {
        super(title, key, category);
        setNonConflict();
    }
    public NonConflictKeyMapping(String title, InputConstants.Type type, int key, String category) {
        super(title, type, key, category);
        setNonConflict();
    }

    private void setNonConflict() {
        this.setKeyConflictContext(new IKeyConflictContext() {
            @Override
            public boolean isActive() {
                return false;
            }
            @Override
            public boolean conflicts(IKeyConflictContext other) {
                return false;
            }
        });
    }

    public boolean same(KeyMapping key)  {
        return false;
    }

    public boolean hasKeyCodeModifierConflict(KeyMapping other) {
        return true;
    }
    
    public boolean isDown;
    @Override
    public boolean isDown() {
        return isDown;
    }

    @Override
    public void setDown(boolean value) {
        isDown = value;
    }
}
