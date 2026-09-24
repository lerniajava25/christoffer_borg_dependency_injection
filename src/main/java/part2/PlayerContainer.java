package part2;

import output.AudioOutput;
import output.SpeakerOutput;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PlayerContainer {

    public Object playerContainer(Class<?> clazz)
            throws InvocationTargetException, InstantiationException, IllegalAccessException {

        if (clazz == AudioOutput.class) {
            clazz = SpeakerOutput.class;
        }
        Constructor<?> constructor = clazz.getDeclaredConstructors()[0];
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (parameterTypes.length > 0) {
            Object dependency = playerContainer(parameterTypes[0]);
            return constructor.newInstance(dependency);
        } else {
            return constructor.newInstance();
        }
    }
}
